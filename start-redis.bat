kubectl delete -f ./components/.

kubectl apply -f ./components/redis-deployment.yaml

kubectl apply -f ./components/statestore.redis.yaml
