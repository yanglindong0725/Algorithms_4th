# !/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time     : 2018/8/21  15:53
# @Author   : D.Henry
# @Email    : 1009444100@qq.com
# @File     : 1.1.14
# @Software : PyCharm

# ------------------------------------------------------------------------------
# 1.1.14 题目描述
# 编写一个静态方法lg(), 接受一个整型参数N，返回不大于 log2N 的最大整数。
# 不要使用Math库
# ------------------------------------------------------------------------------

import sys


def lg(n):
	k = 0
	k_power_of_2 = 1
	while k_power_of_2 < n:
		k_power_of_2 *= 2
		k = k + 1
	return k - 1


if __name__ == '__main__':
	if len(sys.argv) > 2:
		N = int(sys.argv[1])
	else:
		N = int(input('请输入一个正整数N:'))
	result = lg(N)
	print(result)
