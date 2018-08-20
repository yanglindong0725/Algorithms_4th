# !/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time     : 2018/8/19  22:35
# @Author   : D.Henry
# @Email    : 1009444100@qq.com
# @File     : 1.1.11
# @Software : PyCharm

# ------------------------------------------------------------------------------
# 1.1.11 题目描述
# 编写一段代码，打印出一个二维布尔数组的内容。
# 其中,使用*表示真，空格表示假。
# 打印出行号和列号
# ------------------------------------------------------------------------------

import sys
import random


def random_n_dimensional_array(n):
	n_dimensional_array = [[1] * n for i in range(n)]
	for i in range(n):
		for j in range(n):
			n_dimensional_array[i][j] = random.random() > 0.5
	return n_dimensional_array


if __name__ == '__main__':
	if len(sys.argv) > 1:
		a = random_n_dimensional_array(int(sys.argv[1]))
	else:
		a = random_n_dimensional_array(10)

	print("  " + ' '.join('%2d' % (n + 1) for n in range(len(a))))
	s = '* '
	for i in range(len(a)):
		print(str(i + 1) + "  " + "  ".join(
			str(s[a[i][j]]) for j in range(len(a))))
