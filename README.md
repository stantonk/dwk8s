# Dropwizard, Ksonnet, Kubernetes, fabric8 docker-maven-plugin

This is an example project that stitches together a containerized Dropwizard
REST API service that automatically builds a container and pushes it
to AWS Elastic Container Registry (ECR) during the normal `mvn` build
lifecycle (`mvn deploy`).


It also uses [Ksonnet](https://ksonnet.io/) to represent the Kubernetes service configuration,
so you can deploy the containerized Dropwizard Service to a k8s cluster running
in your same AWS account.


Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
