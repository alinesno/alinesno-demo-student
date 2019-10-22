node("hub-node") {
   def mvnHome

   stage('构建准备') {
        // git url: 'https://github.com/alinesno/alinesno-demo-student.git'
        mvnHome = tool 'M3'

        env.JAVA_HOME="${tool 'jdk1.8.0_112'}"
        env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"
        sh 'java -version'
    }

   stage('工程打包') {
      sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package spring-boot:repackage"
   }

    stage ('单元测试') {
      sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean test"
    }

    stage ('构建镜像') {
        sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore docker:build"
    }

    stage ('上传镜像') {
        sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore docker:push"
    }

    stage ('发布开发环境') {
        sh "kubectl apply -f ${WORKSPACE}/k8s-dev.yaml"
    }
}


