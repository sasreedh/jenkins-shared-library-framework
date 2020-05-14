@Library('jenkins-library@master') _

stage('Demo') {
    echo 'Hello world'
    sayHello 'Dave'
