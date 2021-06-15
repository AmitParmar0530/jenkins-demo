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
                        url 'https://AmitParmar0530@github.com/ChatAsyncKafka/chatasync-backend.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}