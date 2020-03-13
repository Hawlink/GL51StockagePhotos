package gl51.service.implement

import gl51.service.PhotoService

import javax.inject.Inject

class DatabaseUpdateServiceImpl implements gl51.service.DatabaseUpdateService {

    @Inject
    PhotoService photoService
}
