def call(Map params = [:]) {
  sh "echo ${params.name} ${params.id}"
}
