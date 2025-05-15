def call(Map config) {
  sh "sleep 10 && curl -f --retry 5 ${config.url}"
}
