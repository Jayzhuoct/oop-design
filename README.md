# 面向对象课程设计

- 开发工具：Eclipse
- 开发语言：Java
- JDK版本：1.8
- 文件编码：GBK
- 开发平台：Windows 10
- 开发时间：2021.12.1-2021.12.6

### 项目简介

通过课程设计，进一步理解面向对象程序设计的思想、技术及相关概念，提高学生运用面向对象的程序设计技术分析问题、解决问题的能力；
能根据问题描述熟练地抽象类、定义类、对类进行封装，并能运用抽象类及接口等技术实现低耦合、高性能的软件维护和功能扩展，能进行简单的事件处理及异常处理等，为以后利用面向对象程序设计技术进行软件开发打下良好的基础。

### 项目要求

一、根据studentsdata.txt文件中的数据信息创建Student类，同时创建一个StudentsAdmin类，并将StudentsAdmin类的各方法实现补充完整，该类的功能是用于对所有学生进行管理。

二、某同学要为某公司开发员工工资信息管理系统，该同学经过调研，得到系统功能要求如下：
该公司目前有两类员工：普通员工（GeneralEmployee）和销售类员工（SaleEmployee），目前有行政部、运营部、后勤部、销售部、研发部等部门。
1. 员工属性信息有：编号(num)、姓名(name)、性别（sex）、年龄（age）、职称（professionaltitle）、学历(educationbackground)、所在部门（department）、是否党员（ispartymember）
2. 部门信息有：部门编号、部门名称、部门经理、员工列表、统计部门人数的方法。
3. 这两类员工工资的计算方法不同，对于员工工资的计算公式如下：
    - 普通员工：实发工资=基本工资(basicSalary)+岗位工资(jobWage)
    - 销售员工：实发工资=基本工资(basicSalary)+个人销售额(personsaleAmount) ×提成比例(deductrate)
      其中：
      - 职称：只能“初级”、“中级”和“高级”。默认为“初级”。
      - 所有员工的基本工资根据职称划分，初级职称为3000元，中级职称为4000元，高级职称为5000元。
      - 岗位：共分5级，分别为1、2、3、4、5。默认为5级。
      - 岗位工资：根据岗位确定岗位工资，分别为：2000、1800、1600、1400、1200。
4. 至少具有计算实发工资、显示员工工资信息及发放工资的功能。
5. 该公司通过某银行进行工资发放，该银行对外开放的发放工资的接口为:
boolean payWages(String cardno,double amount);
6. 该公司以后可能要增加新的员工类别，所以要充分考虑以后的功能扩充问题。
7. 请根据以上描述定义该系统所需要的相关类。并画出该系统的UML类图。
8. 创建以下文本菜单并实现相应功能：
   - **员工基本信息管理**
      - 显示所有员工信息
      - 添加员工
      - 删除员工
      - 按编号查询员工基本信息
      - 按编号修改职称
      - 按编号修改岗位
      - 按编号修改销售额
   - **部门信息管理**
      - 添加员工
      - 删除员工
      - 按部门编号查询部门
      - 按部门编号显示员工信息
      - 显示部门信息
   - **工资信息管理**
      - 按编号显示员工工资信息
      - 显示所有员工工资信息

三、完成飞机项目小游戏

四、制作简易计算器，实现加、减、乘、除四种运算。