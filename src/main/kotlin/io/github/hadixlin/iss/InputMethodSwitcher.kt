package io.github.hadixlin.iss

/**
 *
 * @author hadix.ly
 * @date 2018-12-23
 */
interface InputMethodSwitcher {

	/**  保存当前输入法,然后切换输入法到英文 */
	fun storeCurrentThenSwitchToEnglish()

	/** 将系统恢复到上次调用 [storeCurrentThenSwitchToEnglish] 时保存的输入法 */
	fun restore()

	/**
	 * 恢复到到上次input模式使用的输入法
	 */
	fun changeLatest()

	/** 切换输入法到英文 */
	fun switchToEnglish()
}
