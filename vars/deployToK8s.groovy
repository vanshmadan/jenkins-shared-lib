def call(Map config) {
  sh """
    kubectl apply -f configmap.yaml --kubeconfig=$KUBECONFIG
    kubectl apply -f deployment.yaml --kubeconfig=$KUBECONFIG
    kubectl apply -f service.yaml --kubeconfig=$KUBECONFIG
  """
}
