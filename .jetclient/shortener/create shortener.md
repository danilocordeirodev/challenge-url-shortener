```toml
name = 'create shortener'
method = 'POST'
url = '{{baseUrl}}/shorten-url'
sortWeight = 1000000
id = 'e52f9392-6653-41d3-b468-b556c3b21782'

[[headers]]
key = 'Content-Type'
value = 'application/json'

[body]
type = 'JSON'
raw = '''
{
  "url": "http://www.google.com"
}'''
```
