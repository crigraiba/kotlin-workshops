# Kotlin Workshop

```mermaid
---
title: Employee API
---
flowchart LR
    subgraph Application Layer
        subgraph Controller Layer
            controller(["Controller"])
        end
        subgraph Service Layer
            service(["Service"])
        end
        subgraph Repository Layer
            repository(["Repository"])
        end
        subgraph Domain Layer
            domain[("`PostgreSQL
            Database`")]
        end
    end
    postman["Postman"] <-->|save| controller
    postman["Postman"] <-->|findAll| controller
    controller <--> service <--> repository <--> domain
```

```shell
docker-compose up -d
```