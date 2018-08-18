# !/usr/bin/python
# -*- coding: utf-8 -*-
# @Time     : 2018/8/17  23:54
# @Author   : D.Henry
# @Email    : 1009444100@qq.com
# @File     : 1.1.3.py
# @Software : PyCharm

# ----------------------------------------------
# 1.1.3 题目描述：
# 编写一个程序，从命令行得到三个整数参数。
# 如果它们都相等则打印equal,否则打印not equa.
#
# Python 中用sys的sys.argv来获取命令行参数
# sys.argv是命令行参数列表
# len(sys.argv)是命令行参数个数
# sys.argv[0]表示脚本名
# ----------------------------------------------

import sys


def compare(a, b, c):
	"""比较a, b, c三个整数参数是否相等"""
    if a == b and b == c:
        print("equal")
    else:
        print("not equal")


if __name__ == '__main__':
    if len(sys.argv) > 3:
        print(sys.argv[0] + '运行的结果：', end='')
        compare(int(sys.argv[1]), int(sys.argv[2]), int(sys.argv[3]))
    else:
        print("参数错误：请输入3个整数参数")
        print("example: python 1.1.3.py  2 3 3")
