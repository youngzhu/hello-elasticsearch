elasticsearch是面向文档存储的，数据格式为JSON。

## Elasticsearch VS MySQL

|MySQL| Elasticsearch  | 说明                                                       |
|:---:|:--------------:|----------------------------------------------------------|
|Table|     Index      | 索引（Index），就是文档的集合，类似数据库的表（Table）                         ||
|Row|    Document    | 文档（Document），就是一条条的数据，类似数据库的行（Row）。文档都是JSON格式的           ||
|Column|     Field      | 字段（Field），就是JSON文档中的字段，类似数据库的列（Column）                   ||
|Schema|    Mapping     | Mapping（映射）是索引文档中对字段的约束，如字段类型的约束。类似数据库的表结构（Schema）       ||
|SQL|      DSL       | DSL是elasticsearch提供的JSON风格的请求语句，用来操作elasticsearch，实现CRUD ||