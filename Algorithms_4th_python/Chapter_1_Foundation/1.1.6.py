# !/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time     : 2018/8/18  23:42
# @Author   : D.Henry
# @Email    : 1009444100@qq.com
# @File     : 1.1.6
# @Software : PyCharm


# 运行以下代码得出结果
# 以下Python代码是翻译书中的Java代码
# 结果：输出全都为0


if __name__ == '__main__':
	f = 0
	g = 0
	for i in range(16):
		print(f)
		f = f + g
		g = f - g
