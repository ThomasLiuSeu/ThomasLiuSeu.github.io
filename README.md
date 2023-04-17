
#### @file H5转盘抽奖插件
#### @author 梁亚军 1148063373@qq.com 2018.11.15
#### luckDraw.js 文件参数说明

### DEMO地址
1. [转盘抽奖指针旋转DEMO预览](https://rattenking.gitee.io/luckdraw/index.html)
1. [转盘抽奖转盘旋转DEMO预览](https://rattenking.gitee.io/luckdraw/turntable.html)
2. [九宫格抽奖DEMO预览](https://rattenking.gitee.io/luckdraw/prize.html)

### 插件效果图

1. 转盘抽奖

---

![转盘抽奖](https://images.gitee.com/uploads/images/2020/0605/152138_c91d3e76_1681522.png)

2. 九宫格抽奖

---

![转盘抽奖](https://rattenking.gitee.io/luckdraw/images/prize.png)

### 插件传入参数说明

| 参数 | 类型 | 必填 | 默认值 | 说明 |
|----|-----|-----|-----|-----|
| pointerId | String | 选填 | luckPointer | 指针对象id |
| turntableId | String | 选填 | luckTurntable | 转盘对象id |
| rotateId | String | 必填 | luckTurntable | 旋转对象id |
| activeClass | String | 九宫格抽奖必填 | rui-active | 九宫格抽奖选中是的效果 |
| type | String | 必填 | turntable | 选择是九宫格抽奖还是转盘抽奖（turntable：转盘抽奖；prize：九宫格抽奖） |
| time | Number | 选填 | 2000 | 抽奖动作的时间 |
| luckNumber | Number | 必填 | 4 | 中奖位置 |
| typeNumber | Number | 必填 | 6 | 共有多少个中奖位置 |
| circleNumber | Number | 必填 | 10 | 轮回圈数后中奖 |
| success | Funtion | 选填 | function(){} | 抽中后返回的成功函数 |

 ### 插件demo动效图

 ![插件demo动效图](https://rattenking.gitee.io/luckdraw/images/luck.gif)