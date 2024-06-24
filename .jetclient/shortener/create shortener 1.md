```toml
name = 'create shortener 1'
method = 'GET'
url = '{{baseUrl}}/o7BEB6'
sortWeight = 2000000
id = '67431af0-488b-40b7-8290-ddab4e80e3f6'

[[headers]]
key = 'Content-Type'
value = 'application/json'

[body]
type = 'JSON'
raw = '''
{
  "url": "http://google.com"
}'''
```
