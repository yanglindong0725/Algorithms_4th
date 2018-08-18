# !/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time     : 2018/8/18  22:38
# @Author   : D.Henry
# @Email    : 1009444100@qq.com
# @File     : 1.1.5
# @Software : PyCharm

# ------------------------------------------------------------
# 1.1.5 题目描述
# 编写一段程序,如果double类型的变量x和y都严格位于0和1之间
# 则打印true
# 否则打印false
# ------------------------------------------------------------

import sys


def compare_double(x, y):
	"""比较x和y是否严格属于0和1之间"""
	if 0 < x < 1 and 0 < y < 1:
		print('true')
	else:
		print('false')


if __name__ == '__main__':
	if len(sys.argv) > 2:
		compare_double(float(sys.argv[1]), float(sys.argv[2]))
	else:
		print("参数错误：请输入2个double参数")
		print("example: python 1.1.5.py  0.44 0.5")
