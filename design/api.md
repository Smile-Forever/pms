

# 0 约定

## 状态码约定

| code | desc           |
| ---- | -------------- |
| 0    | 正常返回       |
| 401  | 未登录         |
| 500  | 服务的统一错误 |



## 响应数据格式约定

所有接口都返回`JSON` 格式。具体格式如下：

```javascript
{
	"code":Integer, // 状态码
	"data": {}, // 请求结果
	"msg":String // 有错误时，该属性返回错误描述，其余情况下该属性为null
}
```



# 1 系统配置

## 1.1 职位管理

### 获取所有

- URI

`GET`   `/sys-config/position/list`

- Resp

```javascript
{
	"code":Integer, 
	"data": [
		{
			"id" : Integer , // 职位id
			"name" : String , // 职位名
			"enable" : Boolean // 是否可用
		},
		...
	],
	"msg":String 
}
```

### 新增职位

- URI

`POST`   `/sys-config/position/new`

- Param

```javascript
{
    "name": String // 部门名称
}
```

- Resp

```javascript
{
	"code":Integer, // code 为零表示成功 ， 其余code值参考同意约定
    "data": {
        "newId":Integer , // 新建的职位对应的id
    },
	"msg":String 
}
```


### 更新职位

- URI

`POST`   `/sys-config/position/update`

- Param

```javascript
{
    "id":Integer,
    "name": String ,// 部门名称
    "enable":Boolean
}
```

- Resp

```javascript
{
	"code":Integer, // code 为零表示成功 ， 其余code值参考同意约定
    "data":null,
	"msg":String 
}
```

### 删除职位

- URI

`GET`   `/sys-config/position/delete`

- Param
  - id : Integer , // 要删除的职位的id

- Resp

```javascript
{
	"code":Integer, // code 为零表示成功 ， 其余code值参考同意约定
    "data": null,
	"msg":String 
}
```



## 1.2 职称管理

## 1.3 部门管理

