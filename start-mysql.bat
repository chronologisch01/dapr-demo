kubectl delete -f ./components/.

kubectl apply -f ./components/mysql-deployment.yaml

kubectl apply -f ./components/statestore.mysql.yaml
