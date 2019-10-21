# !/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time     : 2018/8/21  22:32
# @Author   : D.Henry
# @Email    : 1009444100@qq.com
# @File     : 1.1.15
# @Software : PyCharm

# ------------------------------------------------------------------------------
# 1.1.15 题目描述
# 编写一个静态方法 histogram()
# 接受一个整型数组 a[] 和一个整数 M 为参数
# 返回一个大小为 M 的数组，其中第 i 个元素的值为整数 i 在参数数组中出现的次数。
# 如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length相等
# ------------------------------------------------------------------------------


def histogram(a, M):
	rest_lists = [0 for i in range(M)]
	for i in range(M):
		m = 0
		for j in range(len(a)):
			if i == a[j]:
				m = m + 1
		rest_lists[i] = m
	return rest_lists


if __name__ == '__main__':
	lists = [6, 3, 6, 2, 7, 3, 8, 4, 0, 3, 6, 0, 2, 5, 1, 8, 4, 0, 3]
	M = 6
	result = histogram(lists, M)
	sum_result = 0
	for i in range(len(result)):
		sum_result = sum_result + result[i]
	print(result)
	print(sum_result)
	print(len(lists))
