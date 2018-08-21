# !/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time     : 2018/8/21  23:40
# @Author   : D.Henry
# @Email    : 1009444100@qq.com
# @File     : 1.1.20
# @Software : PyCharm

# ------------------------------------------------------------------------------
# 1.1.20 题目描述
# 编写一个递归函数计算ln(N!)的值
# ------------------------------------------------------------------------------

import math


def lograithmic(N):
	if N == 0 or N == 1:
		return 0
	return lograithmic(N - 1) + math.log(N)


if __name__ == '__main__':
	n = int(input("请输入一个正整数："))
	factorial_of_n = 1
	for i in range(1, n + 1):
		factorial_of_n = factorial_of_n * i
	result = lograithmic(n)
	print(factorial_of_n)
	print(math.log(factorial_of_n))
	print(result)
