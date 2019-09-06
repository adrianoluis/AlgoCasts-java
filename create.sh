#!/bin/sh
if [ "$#" -lt 1 ]
then
  echo "Usage: $0 <testpackage>" >&2
  exit 1
fi

mkdir -p "src/main/java/net/adrianoluis/study/$1" "src/test/java/net/adrianoluis/study/$1" && \
  echo "package net.adrianoluis.study.$1;\n\npublic class Solution {\n\n\tpublic void $1() {\n\t}\n}" > \
    "src/main/java/net/adrianoluis/study/$1/Solution.java" &&
  echo "package net.adrianoluis.study.$1;\n\nimport org.junit.Before;\nimport org.junit.Test;\n\npublic class " \
    "SolutionTest {\n\n\tprivate Solution solution;\n\n\t@Before\n\tpublic void setUp() {\n\t\tsolution = new " \
    "Solution();\n\t}\n\n\t@Test\n\tpublic void test1() throws Throwable {\n\t}\n}"> \
    "src/test/java/net/adrianoluis/study/$1/SolutionTest.java"
