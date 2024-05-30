# Redis Workshop

Redis is a key-value non-relational database. It can also be used for caching.

## Dependencies

- [Spring Data Redis](https://mvnrepository.com/artifact/org.springframework.data/spring-data-redis)

## Architecture

```mermaid
flowchart
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
            domain[("`Redis
            Database`")]
        end
    end
    controller <--> service <--> repository <--> domain
```

## Commands

Run Spring Boot: EmployeeApplication in IntelliJ.

List running Docker containers:

```shell
docker container ps
```

Notice `redis-workshop-database-1` is listed.

Open Swagger UI in your browser:

```text
http://localhost:8080/swagger-ui/index.html
```

![Swagger UI](swagger-ui.png)

:woman_scientist: Try it out!

Open Redis CLI in your terminal:

```shell
docker exec -it redis-workshop-database-1 redis-cli
```

<table>
<tr>
<td><pre>monitor</pre></td>
<td>Open the monitoring mode.</td>
</tr>
<tr>
<td><pre>set my_key my_value</pre></td>
<td>Set key-value pair. Optional:
<ul>
<li><code>xx</code> to overwrite the value if the key already exists.</li>
<li><code>nx</code> to overwrite the value if the key does not exist yet.</li>
<li><code>ex 60</code> to set an expiration time in seconds.</li>
<li><code>keepttl</code> to not reset the expiration time when overwriting a value.</li>
</ul>
</td>
</tr>
<tr>
<td><pre>expire my_key 60</pre></td>
<td>Set expiration time of key in seconds.</td>
</tr>
<tr>
<td><pre>ttl my_key</pre></td>
<td>Get amount of time left in seconds for a key to expire. Stands for <i>time to live</i>.</td>
</tr>
<tr>
<td><pre>get my_key</pre></td>
<td>Get value by its key.</td>
</tr>
<tr>
<td><pre>keys pattern</pre></td>
<td>List keys matching pattern.</td>
</tr>
<tr>
<td><pre>quit</pre></td>
<td>Exit.</td>
</tr>
</table>
