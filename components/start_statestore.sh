kubectl apply -f statestore-component.yaml
kubectl apply -f redis-deployment.yaml
kubectl rollout status deploy/redis
kubectl apply -f spring-client.yaml
kubectl rollout status deploy/spring-client
kubectl get pods
minikube service --all 