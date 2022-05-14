node {
        stage('checking maven version') {
           bat label: 'version', script: 'mvn -v'
        }
        stage('repository cloning') {
            git branch: 'main', credentialsId: '0ee5051b-b521-4ddb-802a-c67ee175b824', url: 'https://github.com/mdbasheer333/codingmentortaf.git'
        }
        stage('checking compilation errors') {
            bat label: 'compile', script: 'mvn clean compile'
        }
        stage('executing tests') {
            bat label: 'exe', script: 'mvn clean test -DsuiteXmlFile=regression.xml -DbrowserType=chrome'
        }
}