# 一个简单战舰游戏：
## 在一个一维数组中给定三个连续的位置为舰体
## 用户猜数字，猜的数字为舰体的下角标，则认为击中了（hit),如果不为舰体下角标，则为miss;如果刚好舰体全没有了，则为kill
# 需要 战舰类，用来描述战舰的属性（如舰体数量），战舰的状态。 游戏类，来给用户进行交互。
## 类名:DotCom  属性: 血量(舰体数量) 位置(舰体所在数组下标) 状态：是否死亡
## 类名：Game  变量：用户所猜的数字 。