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

import sys
import random


def transposition_matrix(array):
	"""转置矩阵操作"""
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
	if len(sys.argv) > 2:
		M = int(sys.argv[1])
		N = int(sys.argv[2])
	else:
		M = 20
		N = 20

	init_matrix = random_n_dimensional_array(M, N)
	trans_matrix = transposition_matrix(init_matrix)
	print("转置前：")
	print_matrix(init_matrix)
	print('-' * 79)
	print("转置后：")
	print_matrix(trans_matrix)

# 运行结果
# > python 1.1.13.py 12 15
# 转置前：
#      1   2   3   4   5   6   7   8   9  10  11  12  13  14  15
# ---------------------------------------------------------------
#  1-  4   2  10  10   9   3   1   8   9   4   7   8   8   1   4
#  2-  6   4   5   4   7   1   1   3   6   2   7   3   7   4   3
#  3-  7   6   4  10   9   4  10   1   3   5   7   8   8   3   2
#  4-  7   7   7   8   8   4   9   9   6   3   8   3   1   2   8
#  5-  6   4   3   1  10   2   7   9   2   7   1   1   6   9   9
#  6-  9   4   2   8   5   8   9   7   1   9  10   8   2   4   3
#  7-  8   7   3   4   6   5   4   3  10   7   1   2   3   3   9
#  8-  6   4   9   2   3   3  10   2   2   9   6   6   7   2   1
#  9-  4   9   3   9  10  10   9   7   9   6   7   2  10   3  10
# 10-  7   9   6   9   6  10   7   7   7   8   8   1   3   7   5
# 11-  6   1   7   5  10   5   3   6   3   2   2   1   9   7   3
# 12-  1  10   2   3  10  10   4   2   8   4   6   7   1   6   7
# -------------------------------------------------------------------------------
# 转置后：
#      1   2   3   4   5   6   7   8   9  10  11  12
# ---------------------------------------------------
#  1-  4   6   7   7   6   9   8   6   4   7   6   1
#  2-  2   4   6   7   4   4   7   4   9   9   1  10
#  3- 10   5   4   7   3   2   3   9   3   6   7   2
#  4- 10   4  10   8   1   8   4   2   9   9   5   3
#  5-  9   7   9   8  10   5   6   3  10   6  10  10
#  6-  3   1   4   4   2   8   5   3  10  10   5  10
#  7-  1   1  10   9   7   9   4  10   9   7   3   4
#  8-  8   3   1   9   9   7   3   2   7   7   6   2
#  9-  9   6   3   6   2   1  10   2   9   7   3   8
# 10-  4   2   5   3   7   9   7   9   6   8   2   4
# 11-  7   7   7   8   1  10   1   6   7   8   2   6
# 12-  8   3   8   3   1   8   2   6   2   1   1   7
# 13-  8   7   8   1   6   2   3   7  10   3   9   1
# 14-  1   4   3   2   9   4   3   2   3   7   7   6
# 15-  4   3   2   8   9   3   9   1  10   5   3   7
