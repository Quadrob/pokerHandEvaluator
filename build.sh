#!/bin/bash

read -p "Would you like to execute the Unit tests? [y/n]: " test

testing() {
    ./mvnw clean package
    finished
}

notesting() {
    ./mvnw clean package -Dmaven.test.skip=true
    finished
}

finished() {
    read -rsp $'Press any key to continue...\n' -n 1
}

if [ "${test:0:1}" = "y" ] || [ "${test:0:1}" = "Y" ]; then
    testing
elif [ "${test:0:1}" = "n" ] || [ "${test:0:1}" = "N" ]; then
    notesting
else
    echo "Did not match any required input, running build with tests by default!"
    testing
fi
