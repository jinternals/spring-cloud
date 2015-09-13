#!/bin/sh

contains() {
    local array="$1[@]"
    local seeking=$2
    local in=1
    for element in "${!array}"; do
        if [[ $element == $seeking ]]; then
            in=0
            break
        fi
    done
    return $in
}

help_config(){
    echo "******************            Build Help           ******************"
    echo "*                                                                   *"
    echo "*  Build all command     ==>  sh build.sh build-all    docker|local *"
    echo "*  Build client command  ==>  sh build.sh build-client docker|local *"
    echo "*  Build server command  ==>  sh build.sh build-server docker|local *"
    echo "*                                                                   *"
    echo "******************            Build Help           ******************"
}

profiles=(docker local)

if [ "$#" -ne  "0" ]
then

if [[ " ${profiles[*]} " =~ " $2 " ]]; then
    echo "Active profile $2"
else
    help_config
    exit
fi

    if [ "$1" = "build-all" ]
    then

        echo "***************** Building all modules using $2 profile *****************"
        mvn clean install -P $2
    elif [ "$1" = "build-client" ]
    then

        echo "***************** Building client module using $2 profile *****************"
        mvn install -pl spring-cloud-config-client -am -P $2
    elif [ "$1" = "build-server" ]
    then

        echo "***************** Building server module using $2 profile *****************"
        mvn install -pl spring-cloud-config-server -am -P $2
    elif [ "$1" = "help" ]
    then

    help_config

    fi
else

help_config

fi