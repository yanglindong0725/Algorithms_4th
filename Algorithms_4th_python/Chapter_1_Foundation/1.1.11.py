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
	"""初始化随机二维布尔数组"""
	n_dimensional_array = [[1] * n for i in range(n)]
	for i in range(n):
		for j in range(n):
			n_dimensional_array[i][j] = random.random() > 0.5
	return n_dimensional_array


def print_bool_matrix(matrix, s):
	"""打印布尔类型的二维矩阵,matrix是bool矩阵，s是含有两个字符的字符串"""
	double_blank = '  '
	triple_blank = '   '
	row_fmt = '{0:0>2d}  {1}'
	len_row = len(matrix)
	# 初始化列序列
	head_lists = []
	for i in range(len_row):
		head_lists.append('{:0>2d}'.format(i + 1))
	print('{0}  {1}'.format(double_blank, double_blank.join(head_lists)))
	# 打印布尔数组
	for i in range(len_row):
		row = i + 1
		row_lists = []
		for j in range(len_row):
			r = s[a[i][j]]
			row_lists.append(str(r))
		print(row_fmt.format(row, triple_blank.join(row_lists)))


if __name__ == '__main__':
	"""默认打印10*10的矩阵，可选命令行传参"""
	if len(sys.argv) > 1:
		a = random_n_dimensional_array(int(sys.argv[1]))
	else:
		a = random_n_dimensional_array(10)
	# 打印*号和空格表示的矩阵
	print_bool_matrix(a, '-*')
	print('-' * 100)
	# 打印0、1表示的矩阵
	print_bool_matrix(a, '01')
