# Bar- Spring Boot REST service with two endpoints

## Build Docker Image with Maven
`mvn package docker:build`

## Docker Image
<a href="https://hub.docker.com/repository/docker/kunupat/bar" target="_blank">kunupat/bar</a>


## Jaeger Env Vars
<pre><code>
-DJAEGER_SERVICE_NAME=bar
-DJAEGER_SAMPLER_TYPE=const
-DJAEGER_SAMPLER_PARAM=1
-DJAEGER_REPORTER_LOG_SPANS=true
-DJAEGER_ENDPOINT=http://18.234.185.64:14268/api/traces
</pre></code>