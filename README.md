# Spring-data-envers example
Provides example code for using spring-data-envers with spring boot

## Run the application
Run the application and go to http://localhost:8080

## Add article

```
    curl --location --request POST 'http://localhost:8080/articles' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "title": "First article",
    "content": "<h3>My first article</h3><p>This is first paragraph</p>"
}'
```
## Update article

```
   curl --location --request PATCH 'http://localhost:8080/articles/1' \
   --header 'Content-Type: application/json' \
   --data-raw '{
       
       "content": "<h3>My first article</h3><p>This is first paragraph</p><p>This is second parapraph</p>"
   }'
```

## Check revisions
Goto http://localhost:8080/articles/history/1

```
 public List<Article> articleHistory(Long id) {
        return articleRepository.findRevisions(id).stream().map(revision -> revision.getEntity()).collect(Collectors.toList());
    }
```
