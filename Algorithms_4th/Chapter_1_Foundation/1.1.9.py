# !/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time     : 2018/8/18  23:58
# @Author   : D.Henry
# @Email    : 1009444100@qq.com
# @File     : 1.1.9.py
# @Software : PyCharm


# ---------------------------------------------------------------------
# 1.1.9 题目描述
# 编写一段代码，将一个正整数N用二进制表示转化为一个String类型的值s
# ---------------------------------------------------------------------

import random
import sys


def n_to_binary_string(n):
	"""将一个正整数用二进制表示，并转换为String类型"""
	# 方法一：
	# binary_str = ''
	# while n > 0:
	# 	binary_str = str(n % 2) + binary_str
	# 	n = n // 2
	# return binary_str

	# 方法二：
	binary_lists = []
	while n > 0:
		binary = str(n % 2)
		binary_lists.append(binary)
		n = n // 2
	binary_str = "".join(binary_lists)
	return binary_str


if __name__ == '__main__':
	if len(sys.argv) > 1:
		N = int(sys.argv[1])
		binary_string = n_to_binary_string(N)
		print("正整数 " + str(N) + " 转换为二进制字符串为 " + binary_string)
	else:
		N = random.randint(1, 1000000)
		binary_string = n_to_binary_string(N)
		print("随机正整数 " + str(N) + " 转换为二进制字符串为 " + binary_string)
