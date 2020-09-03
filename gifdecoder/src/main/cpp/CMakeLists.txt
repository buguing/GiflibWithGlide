cmake_minimum_required(VERSION 3.4.1)

file(GLOB_RECURSE GIF_LIB ${CMAKE_SOURCE_DIR}/giflib/*.c)
file(GLOB_RECURSE FRAME_SEQUENCE ${CMAKE_SOURCE_DIR}/*.cpp*)

add_library(
        # 要编译的库的名称，可以改
        giftool

        # SHARED 表示要编译动态库
        SHARED

        # 把giflib源文件等添加到 giftool 这个库中去
        ${GIF_LIB}
        ${FRAME_SEQUENCE})

#find_library(
#        log-lib
#
#        log)

set(LIBS)
list(APPEND LIBS
        jnigraphics
        log
        )

target_link_libraries(
        giftool
        # 给giftool 添加一些依赖
        ${LIBS})