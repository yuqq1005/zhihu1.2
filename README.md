表1 文章表（article）

| 名          | 类型     | 长度  | 小数点 | NULL | 主键 |
| ----------- | -------- | ----- | ------ | ---- | ---- |
| id          | int      | 20    |        | 否   | 是   |
| title       | Varchar  | 30    |        | 否   |      |
| content     | Varchar  | 10000 |        | 否   |      |
| create_user | int      | 10    |        | 否   |      |
| create_time | dateTime |       |        | 否   |      |
| update_time | dateTime |       |        | 否   |      |
| favor       | int      | 30    |        | 否   |      |
| is_epanded  | Varchar  | 20    |        | 否   |      |

 

 

表2 用户表（user）

| 名          | 类型     | 长度 | 小数点 | NULL | 主键 |
| ----------- | -------- | ---- | ------ | ---- | ---- |
| id          | int      | 20   |        | 否   | 是   |
| create_time | dateTime |      |        | 否   |      |
| update_time | dateTime |      |        | 否   |      |
| username    | varchar  | 255  |        | 否   |      |
| password    | varchar  | 255  |        | 否   |      |



 

 

表3一级评论（comment）

| 名          | 类型     | 长度 | 小数点 | NULL | 主键 |
| ----------- | -------- | ---- | ------ | ---- | ---- |
| comment_id  | int      | 11   |        | 否   | 是   |
| article_id  | Varchar  | 255  |        | 否   |      |
| content     | varchar  | 255  |        | 否   |      |
| create_time | dateTime |      |        | 否   |      |
| update_time | dateTime |      |        | 否   |      |
| good_count  | int      | 11   |        | 否   |      |
| create_user | int      | 15   |        | 否   |      |
| img_path    | varchar  | 150  |        |      |      |

 

表3二级评论（reply）

| 名          | 类型     | 长度 | 小数点 | NULL | 主键 |
| ----------- | -------- | ---- | ------ | ---- | ---- |
| reply_id    | int      | 11   |        | 否   | 是   |
| comment_id  | int      | 10   |        | 否   |      |
| content     | varchar  | 255  |        | 否   |      |
| create_time | dateTime |      |        | 否   |      |
| update_time | dateTime |      |        | 否   |      |
| good_count  | int      | 11   |        | 否   |      |
| create_user | int      | 15   |        | 否   |      |
| img_path    | varchar  | 150  |        |      |      |

主账号：yyuuq

密码：11223344



