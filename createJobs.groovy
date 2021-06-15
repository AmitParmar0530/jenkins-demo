pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('chatasync-backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ChatAsyncKafka/chatasync-backend.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}