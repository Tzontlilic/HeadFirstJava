作者的思路是，在编码时，先去写测试类，这样能够让人顺应思路了解到类需要做什么。
# SimpleDotComTestDrive 类
## 在测试时，首先需要创造战舰对象， 然后设定战舰在战场所在位置。
 因此，需要一个setLocationCells方法，传入设定战舰位置的int数组.
## 然后战舰需要判断自己是否被击中，传入用户选择的数字。并且返回string的结果
 因此，需要一个checkYourself方法。

## 整个工作流程为：
# 创建战舰对象  SimpleDot dot = new SimpleDot();
# 设定战舰位置	dot.setLocationCells();
# 用户射击	result = dot.checkYourSelf(userShot);
# 返回射击结果  testResult.equals();

# SimpleDot 类
## setLocationCells 方法
   形参：一个描述战舰位置的数组
   返回值：无
## checkYourSelf 方法
   形参：一个用户射击的数字
   返回值：一个描述射击状态的字符串
   
