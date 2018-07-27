1.Internet 气象站项目：
  气象站：
	提供温度、气压和湿度的接口
	测量数据更新时需实时通知第三方
	需要设计开放的API，便于其第三方公司也能接入气象站获取数据
  显示板：显示气象站变化信息
	具体的实现流程：
	当主程序中发现数据变化时--->将值传给气象站-->气象站通知显示板-->显示板更新数据-->将更新的信息进行显示
	setData()--->dataChange()-->update()-->display();
	
2.文件说明
	observer-pattern-ver1:传统的方法实现
	observer-pattern-ver2:自定义的观察者模式实现
	observer-pattern-ver3:Java内置的观察者模式实现
3.其他说明见:https://blog.csdn.net/qq_36890572/article/details/81252864
	