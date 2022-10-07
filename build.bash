#!/bin/bash
set -u -e
javac -cp .:postgresql-42.5.0.jar LaserTag.java Presenter.java Model.java SplashScreen.java PlayerEntry.java
java -cp .:./postgresql-42.5.0.jar LaserTag