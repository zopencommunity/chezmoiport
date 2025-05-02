node('linux')
{
  stage ('Poll') {
    checkout([
      $class: 'GitSCM',
      branches: [[name: '*/main']],
      doGenerateSubmoduleConfigurations: false,
      extensions: [],
      userRemoteConfigs: [[url: 'https://github.com/zopencommunity/chezmoiport.git']]])
  }
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/zopencommunity/chezmoiport.git'), string(name: 'PORT_DESCRIPTION', value: 'This is the test description for "chezmoi" tool' ), string(name: 'BUILD_LINE', value: 'DEV') ]
  }
}
