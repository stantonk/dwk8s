package com.github.stantonk.dwk8s;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardK8sExampleApplication extends Application<DropwizardK8sExampleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardK8sExampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardK8sExample";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardK8sExampleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardK8sExampleConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
