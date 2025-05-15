def call(Map config) {
  sh """
    echo ${config.token} | docker login registry.digitalocean.com -u doctl --password-stdin
    docker push ${config.image}
  """
}
