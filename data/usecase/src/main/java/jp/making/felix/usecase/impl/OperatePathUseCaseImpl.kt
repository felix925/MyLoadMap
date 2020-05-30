package jp.making.felix.usecase.impl

import jp.making.felix.androidcomponent.entity.Path
import jp.making.felix.repository.PathRepository
import jp.making.felix.usecase.OperatePathUseCase

class OperatePathUseCaseImpl(
    val pathRepository: PathRepository
) : OperatePathUseCase {
    override fun deletePath(path: Path) =
        pathRepository.deletePath(path)

    override fun insertPath(path: Path) {
        if (pathRepository.getPathByTitle(path.title) != null) {
            pathRepository.updatePath(path)
        } else {
            pathRepository.insertPath(path)
        }
    }
}