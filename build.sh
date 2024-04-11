#!/bin/bash

# Stop all running Docker containers
docker stop $(docker ps -q)

# Remove all Docker containers
docker rm $(docker ps -a -q)

cd ..
rm -rf ./copy-of-meta-openvario
cp -R meta-openvario copy-of-meta-openvario/
cd ./copy-of-meta-openvario
git submodule update --init --recursive
sudo chown -R 1001:1001 .

# Navigate to the openvario-ppa directory
cd ./openvario-ppa

# Set the OPENVARIO_IMAGE_DIR environment variable
export OPENVARIO_IMAGE_DIR=../

printf "#!/bin/sh\nsource openembedded-core/oe-init-build-env .\nexport MACHINE=openvario-7-CH070\nbitbake openvario-image-ovshell" > init-build.sh

# Start the Docker container in detached mode
docker compose run --rm dev