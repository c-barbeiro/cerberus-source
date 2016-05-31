package org.cerberus.crud.service;

import java.util.List;

import org.cerberus.crud.entity.Robot;
import org.cerberus.crud.entity.RobotCapability;
import org.cerberus.exception.CerberusException;
import org.cerberus.util.answer.Answer;
import org.cerberus.util.answer.AnswerList;

/**
 * {@link RobotCapability} service
 * 
 * @author Aurelien Bourdon
 */
public interface IRobotCapabilityService {

	/**
	 * Get all {@link RobotCapability} which are associated to the given
	 * {@link Robot}'s name
	 * 
	 * @param robot
	 *            the {@link Robot}'s name from which getting all associated
	 *            {@link RobotCapability}
	 * @return a list of {@link RobotCapability} which are associated to the
	 *         given {@link Robot}'s name
	 */
	AnswerList<RobotCapability> readByRobot(String robot);
        
        /**
         * Create a new {@link RobotCapability} to the database
         * 
         * @param capability the new {@link RobotCapability} to create
         * @return a {@link Answer} with the associated return code
         */
        Answer create(RobotCapability capability);
        
        /**
         * Create the list of {@link RobotCapability} to the database
         * 
         * @param capabilities the list of {@link RobotCapability} to create
         * @return a {@link Answer} with the associated return code
         */
        Answer create(List<RobotCapability> capabilities);
        
        /**
         * Update an existing {@link RobotCapability} from the database
         * 
         * @param capability the existing {@link RobotCapability} to update
         * @return a {@link Answer} with the associated return code
         */
        Answer update(RobotCapability capability);
        
        /**
         * Update the list of {@link RobotCapability} from the database
         * 
         * @param capabilities the list of {@link RobotCapability} to update
         * @return a {@link Answer} with the associated return code
         */
        Answer update(List<RobotCapability> capabilities);
        
        /**
         * Delete an exsiting {@link RobotCapability} from the database
         * 
         * @param capability the existing {@link RobotCapability} to delete
         * @return a {@link Answer} with the associated return code
         */
        Answer delete(RobotCapability capability);
        
        /**
         * Delete the list of {@link RobotCapability} from the database
         * 
         * @param capabilities the list of {@link RobotCapability} to delete
         * @return a {@link Answer} with the associated return code
         */
        Answer delete(List<RobotCapability> capabilities);
        
        /**
         * Do a smart create/update/delete from the given list of {@link RobotCapability} to/from database
         * 
         * @param robot the {@link Robot}'s name associated to these new capabilities
         * @param newCapabilities the new list of {@link RobotCapability} to create/update/delete to/from database
         * @return a {@link Answer} with the associated return code
         */
        Answer compareListAndUpdateInsertDeleteElements(String robot, List<RobotCapability> newCapabilities);

	/**
	 * Convert given capability answers to list of {@link RobotCapability}
	 * 
	 * @param capabilityAnswers
	 *            the {@link AnswerList} of {@link RobotCapability} to convert
	 * @return a list of {@link RobotCapability}
	 * @throws CerberusException
	 *             if an error occurred
	 */
	List<RobotCapability> convert(AnswerList<RobotCapability> capabilityAnswers) throws CerberusException;

}
