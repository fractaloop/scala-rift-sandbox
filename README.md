# Scala Rift Sandbox

My initial foray into playing with my Oculus Rift DK1 in Scala.

## Getting started

Build [JRift](https://github.com/38leinaD/JRift) and install it to your local repository.

    git clone git@github.com:38leinaD/JRift.git
    cd JRift
    export OCULUS_SDK=/Users/<YOU>/Downloads/OculusSDK
    make
    cd JRift
    mvn install

Then you can run the sandbox using `sbt run`
