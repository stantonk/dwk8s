{
  global: {
    // User-defined global parameters; accessible to all component and environments, Ex:
    // replicas: 4,
  },
  components: {
    // Component-level parameters, defined initially from 'ks prototype use ...'
    // Each object below should correspond to a component in the components/ directory
    "dwk8s": {
      containerPort: 8080,
      image: "829189492239.dkr.ecr.us-east-1.amazonaws.com/stantonk/dwk8s:0.0.2",
      name: "dwk8s",
      replicas: 2,
      servicePort: 80,
      type: "LoadBalancer",
    },
  },
}
