kubectl delete -f ./components/.

@REM kubectl apply -f ./components/mongodb-deployment.yaml

helm install mongo stable/mongodb

kubectl apply -f ./components/statestore.mongodb.yaml
