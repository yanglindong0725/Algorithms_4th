# !/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time     : 2018/8/21  12:39
# @Author   : D.Henry
# @Email    : 1009444100@qq.com
# @File     : 1.1.13
# @Software : PyCharm

# ------------------------------------------------------------------------------
# 1.1.13 题目描述
# 编写一段代码，打印出一个 M 行 N 列的二维数组的转置
# ------------------------------------------------------------------------------

import random


def transposition_matrix(array):
	t_matrix = [[0] * len(array) for i in range(len(array[1]))]
	for i in range(len(array[1])):
		for j in range(len(array)):
			t_matrix[i][j] = array[j][i]
	return t_matrix


def random_n_dimensional_array(m, n):
	"""初始化随机二维 M * N 的数组"""
	dimensionals_matrix = [[0] * n for i in range(m)]
	for i in range(m):
		for j in range(n):
			dimensionals_matrix[i][j] = random.randint(1, 10)
	return dimensionals_matrix


def print_matrix(matrix):
	"""打印布尔类型的二维矩阵,matrix是bool矩阵，s是含有两个字符的字符串"""
	double_blank = '  '
	triple_blank = '   '
	row_fmt = '{0:>2d}{1} {2}'
	len_row = len(matrix)
	len_column = len(matrix[0])

	# 初始化列序列
	head_lists = []
	for i in range(len_column):
		head_lists.append('{:>2d}'.format(i + 1))
	print('{0}  {1}'.format(double_blank, double_blank.join(head_lists)))
	print('-' * (4 + len_column - 1) + '---' * len_column)
	# 打印布尔数组
	for i in range(len_row):
		row = i + 1
		row_lists = []
		for j in range(len_column):
			r = '{:>2d}'.format(matrix[i][j])
			row_lists.append(str(r))
		print(row_fmt.format(row, '-', double_blank.join(row_lists)))


if __name__ == '__main__':
	M = 5
	N = 8
	init_matrix = random_n_dimensional_array(M, N)
	trans_matrix = transposition_matrix(init_matrix)
	print_matrix(init_matrix)
	print('-' * 79)
	print_matrix(trans_matrix)
