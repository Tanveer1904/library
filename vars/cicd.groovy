def contDow(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
}
def contB()
{
  sh "mvn package"
}
def contDep(ip,path)
{
  "deploy adapters: [tomcat9(credentialsId: '77679e0f-dbe5-4d78-a2a7-2ada8f28f21d', path: '', url: 'http://${ip}')], contextPath: '${path}', war: '**/*.war'"       
}



